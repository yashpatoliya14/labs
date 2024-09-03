const express = require('express');

const app = express();

const PORT = 1000;
app.get('/',(req,res)=>{
    res.send('heelo world');
})

app.listen(PORT,(err)=>{
    console.log(`server is run in port ${PORT}`);
})