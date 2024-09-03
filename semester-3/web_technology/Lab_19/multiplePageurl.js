const express = require('express');
const fs= require('fs');
const child_process = require('child_process')
const app = express();

const PORT = 1000;
app.get('/about',(req,res)=>{
    res.setHeader('content-type' , 'text/html')
    fs.readFile('./about.html' , (err,data)=>{
        res.send(data)
    })
})
app.get('/project',(req,res)=>{
    res.setHeader('content-type' , 'text/html')
    fs.readFile('./project.html' , (err,data)=>{
        res.send(data)
    })
})
app.get('/contact',(req,res)=>{
    res.setHeader('content-type' , 'text/html')
    fs.readFile('./contact.html' , (err,data)=>{
        res.send(data)
    })
})
app.listen(PORT,(err)=>{
    console.log(`server is run in port ${PORT}`);
})