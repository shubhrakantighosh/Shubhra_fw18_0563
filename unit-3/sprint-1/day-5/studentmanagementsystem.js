let data=JSON.parse(localStorage.getItem("StudentData"));
    
data.forEach(function(elem,index){

    let tr=document.createElement("tr");

    let td1=document.createElement("img");
    td1.src=elem.photo;
    td1.style.height="80px";
    td1.style.width="80px";
    td1.style.marginLeft="20px";
    td1.style.marginTop="20px"

    let td2=document.createElement("td");
    td2.innerText=elem.name;

    let td3=document.createElement("td");
    td3.innerText=elem.course;

    let td4=document.createElement("td");
    td4.innerText=elem.batch;

    let td5=document.createElement("td");
    td5.innerText=elem.unit;

    let td6=document.createElement("button");
    td6.innerText="Delete";
    td6.style.color="white";
    td6.style.backgroundColor="red";
    td6.style.border="none";
    td6.style.padding="5px 10px 5px 10px";
    td6.style.borderRadius="5px";
    td6.style.marginBottom="20px";
    td6.style.marginLeft="20px"
    td6.style.cursor="pointer";
    td6.addEventListener("click",function(){
        datadelete(elem,index);
    })

    tr.append(td1,td2,td3,td4,td5,td6);
    document.getElementById("show").append(tr);

})

function datadelete(elem,index){
    data.splice(index,1);
    localStorage.setItem("StudentData",JSON.stringify(data));
    window.location.reload();
}