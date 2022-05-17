document.querySelector("button").addEventListener("click",myCheck);
function myCheck(){
    let ateam=Math.floor(Math.random()*6);

    let bteam=Math.floor(Math.random()*6);
    
    let cteam=Math.floor(Math.random()*6);
    if(ateam===bteam===cteam){
        document.querySelector("#member-1").setAttribute("style","background-color:blue")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:blue")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:blue")
        document.querySelector("#member-3").innerHTML=cteam;
    }
    else if(ateam>bteam&&ateam>cteam&&bteam>cteam){
        document.querySelector("#member-1").setAttribute("style","background-color:green")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:yellow")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:red")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player A";
    }
    else if(ateam>bteam&&ateam>cteam&&cteam>bteam){
        document.querySelector("#member-1").setAttribute("style","background-color:green")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:red")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:yellow")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player A";
    }

    else if(bteam>ateam&&bteam>cteam&&ateam>cteam){
        document.querySelector("#member-1").setAttribute("style","background-color:yellow")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:green")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:red")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player B";
    }
    else if(bteam>ateam&&bteam>cteam&&cteam>ateam){
        document.querySelector("#member-1").setAttribute("style","background-color:red")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:green")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:yellow")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player B";
    }

    else if(cteam>ateam&&cteam>bteam&&ateam>bteam){
        document.querySelector("#member-1").setAttribute("style","background-color:yellow")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:red")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:green")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player C";
    }
    else if(cteam>ateam&&cteam>bteam&&bteam>ateam){
        document.querySelector("#member-1").setAttribute("style","background-color:red")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:yellow")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:green")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player C";
    }

    else if(ateam>bteam&&ateam>cteam&&ateam===bteam){
        document.querySelector("#member-1").setAttribute("style","background-color:green")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:blue")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:blue")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player A";
    }
    else if(bteam>ateam&&bteam>cteam&&ateam===cteam){
        document.querySelector("#member-1").setAttribute("style","background-color:blue")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:green")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:blue")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player B";
    }

    else if(cteam>ateam&&cteam>bteam&&ateam===bteam){
        document.querySelector("#member-1").setAttribute("style","background-color:blue")
        document.querySelector("#member-1").innerHTML=ateam;

        document.querySelector("#member-2").setAttribute("style","background-color:blue")
        document.querySelector("#member-2").innerHTML=bteam;

        document.querySelector("#member-3").setAttribute("style","background-color:green")
        document.querySelector("#member-3").innerHTML=cteam;

        document.querySelector("#winner").setAttribute("style","background-color:chartreuse")
        document.querySelector("#winner").innerHTML="Winner Player C";
    }
}