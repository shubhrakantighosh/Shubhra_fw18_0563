import navbar from "/navbar.js"
    document.getElementById('searchByFilter').innerHTML=navbar();

    let data=document.getElementById('searchByFilter').children;
    for(let i of data){
        i.addEventListener('click',function(){
            let box=i.innerHTML;
            selectTarget(box);
        });
    };
