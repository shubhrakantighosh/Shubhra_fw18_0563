document.getElementById("login-form-div").addEventListener("submit",myCheck);
function myCheck(){
    event.preventDefault();
    let data=JSON.parse(localStorage.getItem("Signupdata")) || [];
    let count1=0;
    let count2=0;
    data.forEach(function(elem){
        count1++;
        let email=document.getElementById("email").value;
        let password=document.getElementById("password").value;

        if(elem.email===email && elem.password===password){
            count2++;
            alert("Login Successfully");
            window.location.href="index.html";
        }

        if(count1===data.length && count2===0){
            alert("invalid Credentials");
            count1=0;
            count2=0;
        }
    });
}