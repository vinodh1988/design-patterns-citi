
function library(mydata)
{
	console.log("library has started the task")
	console.log("Request you to do your part and i m going to give you some data")
	mydata("part1 to be processed")
	console.log("Libary is continuing")
	console.log("Request you continue your part again i am going to give you more data")
	mydata(123)
	console.log("Thanks for doing things...let me finish")
	console.log("FINISHED");
}

library((data)=>{
	console.log("processing->")
	console.log(data)
	
})
//callback function --  a function which is sent as parameter to another function
console.log("-------------------------------------------------------------")
a=function(p){
	console.log("XXXXXXXXXXXXXXXXXX",p);
}

//"Raj");
library(a);



