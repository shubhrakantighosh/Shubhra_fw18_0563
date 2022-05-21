let arr=JSON.parse(localStorage.getItem("Signupdata")) || [];

document.getElementById("signup-form-div").addEventListener("submit",myData);
function myData(){
    event.preventDefault();

    function Data(name,contact,email,password){
        this.name=name;
        this.contact=contact;
        this.email=email;
        this.password=password;
    }

    let name=document.getElementById("name").value;
    let contact=document.getElementById("contact").value;
    let email=document.getElementById("email").value;
    let password=document.getElementById("password").value;
    
    
    let signupdata=new Data(name,contact,email,password);

    arr.push(signupdata);
    if(signupdata.name!=="" && signupdata.contact!=="" && signupdata.email!=="" && signupdata.password!==""){
        localStorage.setItem("Signupdata",JSON.stringify(arr));
        alert("Account Created Successfully");
        window.location.href="login.html";
    }
    else{
        alert("Please Enter all fields");
    }
};