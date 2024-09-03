
const http = require('http');
const fs= require('fs');

const server = http.createServer((req,res)=>{
  	
  	res.setHeader('Content-Type','text/html');
  	
  	if(req.url=='/about'){
  		fs.readFile('about.html',(err,data)=>{
  			if (err) {
				res.statusCode=404;
				res.end("404");
			}else{
				res.end(data);
			}
  		})	
  	}else if(req.url=='/contact'){
		fs.readFile('contact.html',(err,data)=>{
			if (err) {
				res.statusCode=404;
				res.end("404");
			}else{
				res.statusCode=200;
				res.end(data);
			}
		})
	}
	else{
		fs.readFile('Lab_8Extra.html',(err,data)=>{
			if (err) {
				res.statusCode=404;
				res.end("404");
			}else{
				res.statusCode=200;
				res.end(data);
			}
		})
	}

});


server.listen(30000 , ()=>{

})