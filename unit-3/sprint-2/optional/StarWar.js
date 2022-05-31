
    let id;

    async function collectData(inputs){
        try {
            let url=await fetch(`https://swapi.dev/api/people/?search=${inputs}`);
            let data=await url.json();
            return data.results;
            
        } catch (error) {
        //    console.log(error); 
        }
    }
    
    async function search(){
        let inputs=document.getElementById('input').value;
        let data=collectData(inputs);
        let alldata=await data;
        startWars(alldata);

    }

    function startWars(alldata){
        document.getElementById('results_div').innerHTML='';
        alldata.forEach(function(elem){

            document.getElementById('results_div').style.overflow=''
            let h4_tag=document.createElement('h4');
            h4_tag.innerText=elem.name;
            h4_tag.style.color='white';
            h4_tag.style.cursor='pointer';
            h4_tag.addEventListener('click',function(){
                goToDetails(elem);
            });
            document.getElementById('results_div').append(h4_tag);
        })
    }

    function type_wait(func,deley){
        if(id){
            clearTimeout();
        }
       id= setTimeout(function(){
           func();
        },deley)
    }

    function goToDetails(elem){
        document.getElementById('input').style.visibility='hidden';
        document.getElementById('results_div').innerHTML='';
        document.getElementById('startwar_logo').style.visibility='hidden';
        document.getElementById('search_logo').style.visibility='hidden';

        let main_div=document.createElement('div');
        main_div.setAttribute('id','main_div');

        let div=document.createElement('div');
        div.setAttribute('id','result_div_character');

        let name=document.createElement('h1');
        name.innerText=elem.name;

        let div1=document.createElement('div');
        let div2=document.createElement('div');

        let personal_Info=document.createElement('h2');
        personal_Info.innerText='Personal Info';

        let bith_year=document.createElement('h3');
        bith_year.innerText="Birth Year"+" "+":"+" "+elem.birth_year;

        let gender=document.createElement('h3');
        gender.innerText="Gender"+" "+":"+" "+elem.gender;

        let height=document.createElement('h3');
        height.innerText="Height"+" "+":"+" "+elem.height;

        div1.append(personal_Info,bith_year,gender,height);



        let anatomy=document.createElement('h2');
        anatomy.innerText='Anatomy';

        let eye_color=document.createElement('h3');
        eye_color.innerText="Eye Color"+" "+":"+" "+elem.eye_color;

        let mass=document.createElement('h3');
        mass.innerText="Mass"+" "+":"+" "+elem.mass;

        let hair_color=document.createElement('h3');
        hair_color.innerText="Hair Color"+" "+":"+" "+elem.hair_color;

        div2.append(anatomy,eye_color,mass,hair_color);

        let button=document.createElement('button');
        button.innerText='Go Back';
        button.style.color='yellow';
        button.style.cursor='pointer';
        button.addEventListener('click',function(){
            home();
        })

        div.append(div1,div2);

        main_div.append(name,div,button)
        document.getElementById('results_div').append(main_div);
    }

    function home(){
        window.location.reload();
    }