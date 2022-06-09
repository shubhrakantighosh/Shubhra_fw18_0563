

let array=JSON.parse(localStorage.getItem('signup')) ||[];
signupRegister=()=>{
    let name=document.getElementById('name').value;
    let email=document.getElementById('email').value;
    let number=document.getElementById('number').value;
    let password=document.getElementById('password').value;

    if(name==="" || email==="" || number==="" || password===""){
        alert('Please fill all fields');
    }
    else{

    function DataStore(name,email,number,password){
        this.name=name;
        this.email=email;
        this.number=number;
        this.password=password;
    }
    let data=new DataStore(name,email,number,password);
    array.push(data);
    localStorage.setItem('signup',JSON.stringify(array));


    document.getElementById('name').value="";
    document.getElementById('email').value="";
    document.getElementById('number').value="";
    document.getElementById('password').value="";

    alert('Sign In Successfull');
    window.location.href='login.html'
}
}