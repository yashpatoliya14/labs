const child_process = require('child_process')

child_process.exec('node Lab_7c.js',(err,stdout,stdin)=>{
	console.log(stdout)
})