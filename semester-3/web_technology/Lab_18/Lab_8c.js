const fs = require('fs');
const http = require('http');


const server = http.createServer((req,res)=>{
  	fs.readFile('./abc.txt',(err,data)=>{
  		res.end(data);
  	})

});


server.listen(3000 , ()=>{

})