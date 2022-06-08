let count1=0;
let count2=0;

logIn=()=>{
    let email=document.getElementById('email').value;
    let password=document.getElementById('password').value;

    let data=JSON.parse(localStorage.getItem('signup'));

    data.forEach(element => {
        count1++;
        let storeEmail=element.email;
        let storePassword=element.password;
        let name=element.name;

        if(storeEmail===email && storePassword===password){

            localStorage.setItem('login',JSON.stringify(name));
            
            alert('Login successful');
            count2++;
            window.location.href='homePage.html'
        }
    });

        if(count1===data.length && count2===0){
            alert('Invalid Password or Email')
        }
}