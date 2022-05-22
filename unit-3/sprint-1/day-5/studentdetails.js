let array=JSON.parse(localStorage.getItem("StudentData")) || [];
document.getElementById("details").addEventListener("submit",myCheck);
function myCheck(){
    event.preventDefault();
    function Details(name,course,unit,photo,batch){
        this.name=name;
        this.course=course;
        this.unit=unit;
        this.photo=photo;
        this.batch=batch;
    }

    let name=document.getElementById("name").value;
    let course=document.getElementById("course").value;
    let unit=document.getElementById("unit").value;
    let photo=document.getElementById("photo").value;
    let batch=document.getElementById("batch").value;

    let data=new Details(name,course,unit,photo,batch);
    array.push(data);
    localStorage.setItem("StudentData",JSON.stringify(array));    
    window.location.reload();  
}