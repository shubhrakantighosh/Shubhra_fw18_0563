let list=document.getElementById("list_of_items");
let text='<span> You have Selected :</span>';
let array=[];
let checkboxs=document.querySelectorAll(".checkbox");
for(let checkbox of checkboxs){
    checkbox.addEventListener('click',function(){
        if(this.checked==true){
            array.push(this.value);
            console.log("yes");
            list.innerHTML=text+array.join('/');
        }
        else{
            array=array.filter(e =>e !==this.value);
            list.innerHTML=text+array.join('/');
        }
    })
}

function myOrder(){

document.getElementById('order_status_syntax').innerHTML="";
document.getElementById('order_status').innerHTML="";

let h3=document.createElement("h3");
h3.innerText="Please Wait";
document.getElementById('order_status_syntax').append(h3);

let loader=document.createElement("div")
loader.style.height="40px";
loader.style.width="40px";
loader.style.borderTop="4px solid blue";
loader.style.borderRight="2px solid transparent"
loader.style.borderRadius="50%";
loader.setAttribute("id","loader");
document.getElementById('order_status').append(loader);

}

function checkcontent(){
// if(array.length>0){
    return true;
// }
// else{
//     return false;
// }
}
let content_promise= new Promise(function(resolve,reject){

    let content=checkcontent();

    setTimeout(function() {

    if(content){

        resolve("content is loaded");
    }
    else{

        reject('content failed to load');
    }

 },5000);

});
content_promise.then(function(value){
document.getElementById('order_status_syntax').innerHTML='';
let div=document.createElement('div');
let h3=document.createElement("h3");
let h31=document.createElement("h3");
let h32=document.createElement('h3');
h32.innerText='Order No';

h31.style.color="blue";
h31.innerText=Math.floor(Math.random()*400);

h3.innerText="collect from Counter Number of";
div.append(h32,h31,h3)
document.getElementById('order_status_syntax').append(div);

document.getElementById('order_status').innerHTML="";
let h1=document.createElement("h1");
h1.innerText=Math.floor(Math.random()*7)+1;
document.getElementById('order_status').append(h1);

});

content_promise.catch(function(err){
document.getElementById('order_status_syntax').innerHTML='';
document.getElementById('order_status').innerHTML="";

let h3=document.createElement('h3');
h3.innerText='You have not select anything';
document.getElementById('order_status_syntax').append(h3);
});