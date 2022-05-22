data=JSON.parse(localStorage.getItem("StudentData"));
let web20=0;
let web19=0;
let web18=0;
data.forEach(function(elem,index){
    let batch=elem.batch;
    if(batch==="WEB-18"){
        web18++;
    }
    else if(batch==="WEB-19"){
        web19++;
    }
    else{
        web20++;
    }
});
let h41=document.createElement("h4");
h41.innerText="Input";

let h42=document.createElement("h4");
h42.innerText="Data Base";

let h31=document.createElement("h3");
h31.innerText="WEB-18"+" "+":"+" "+web18;

let h32=document.createElement("h3");
h32.innerText="WEB-19"+" "+":"+" "+web19;

let h33=document.createElement("h3");
h33.innerText="WEB-20"+" "+":"+" "+web20;

document.getElementById("navbar").append(h31,h32,h33);