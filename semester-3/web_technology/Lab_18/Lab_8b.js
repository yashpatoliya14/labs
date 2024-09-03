const http = require('http');


const server = http.createServer((req,res)=>{
  	if(req.url==='/aboutus'){
  		res.end('hello about')
  	}else if(req.url==='/contact'){
  		res.end('hello contact')

  	}else if(req.url==='/manage'){
  		res.end('hello manage')
  	}
	else if(req.url==='/projects'){
  		res.end('hello projects')
  	}
	else if(req.url==='/info'){
  		res.end('hello info')  		
  	}

});


server.listen(30000 , ()=>{

})