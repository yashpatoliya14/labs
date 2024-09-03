const { log } = require('console');
const express = require('express');
const app = express();
const fs = require('fs')
const bodyParser = require('body-parser')
const PORT = 2000;

app.use(bodyParser());
app.get('/faculty',(req,res)=>{
     fs.readFile('./MOCK_DATA.json' , (err,data)=>{
        res.send(data.toString()).json();
    })
})

app.get('/faculty/:id',(req,res)=>{
    let faculty;
    fs.readFile('./MOCK_DATA.json' , (err,data)=>{
        faculty = JSON.parse(data.toString());
        // res.send(faculty);
        const d = faculty.find((e)=>{
            return e.id == req.params.id
        })
        res.json(d)
    })
})
app.post('/faculty',(req,res)=>{
    const postData = req.body;
    let  data = fs.readFileSync('./MOCK_DATA.json').toString();

    data = JSON.parse(data);
    data.push(postData);
    fs.writeFileSync('./MOCK_DATA.json',JSON.stringify(data));
    return res.json({done:200});
})
app.delete('/faculty/:id',(req,res)=>{
    let  data = fs.readFileSync('./MOCK_DATA.json').toString();

    data = JSON.parse(data);
    index = data.findIndex(e=>req.params.id==e.id)
    data.splice(index,1);
    fs.writeFileSync('./MOCK_DATA.json',JSON.stringify(data));
    return res.json({done:200});
})
app.listen(PORT,(err)=>{
    console.log(`server is run in port ${PORT}`);
})