const { log } = require('console');
const express = require('express');
const app = express();
const PORT = 2000;
const mongoose = require('mongoose')
app.use(express.urlencoded());
const StudentSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true,
        unique: true
    },
    role: {
        type: String,
        required: true
    },
    id:{
        type: String,
        required: true 
    }
});

const students = mongoose.model('student', StudentSchema,"Students");
// Connect to MongoDB
mongoose.connect('mongodb+srv://yashpatoliya14:12345@cluster0.bjsyv.mongodb.net/faculty', {
    useNewUrlParser: true,
    useUnifiedTopology: true
})
.then(() => {
    app.get('/student',async (req,res)=>{
       return res.send(await students.find());   
    })
   
   app.get('/student/:id',async (req,res)=>{
        const user = await students.find({id:req.params.id})
        res.send(user);
    })
   app.post('/student',async (req,res)=>{
        const user = await students.create({
            name:req.body.name,
            role:req.body.role,
            id:req.body.id,
        })   

        res.send("done");
   })
   app.patch('/student/:id',async (req,res)=>{
        const user = await students.findOneAndUpdate({id:req.params.id},{
            name:req.body.name,
            role:req.body.role,
            id:req.body.id,
        }) 
        res.send("patched"); 
    })
   app.delete('/student/:id',async (req,res)=>{
    const user = await students.deleteOne({id:req.params.id})
    res.send("delted");
   })
})
.catch(err => console.log("MongoDB connection error:", err));


app.listen(PORT,(err)=>{
    console.log(`server is run in port ${PORT}`);
})