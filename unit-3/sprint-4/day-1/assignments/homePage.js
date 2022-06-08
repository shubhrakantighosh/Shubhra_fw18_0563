DataUrl=async(query)=>{
    let url=await fetch(`https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`);
    let dataSeach=await url.json();
    return(dataSeach.meals);
    }


showInput=async()=>{
    document.getElementById('show').innerHTML="";
    let query=document.getElementById('query').value;
    let data=await DataUrl(query);
    data.forEach(element => {
        let div=document.createElement('div');
        div.addEventListener('click',function(){
            goToDetails(element);
        });

        let strMealThumb=document.createElement('img');
        strMealThumb.src=element.strMealThumb;

        let strMeal=document.createElement('p');
        strMeal.innerText=element.strMeal;

        div.append(strMealThumb,strMeal);

        document.getElementById('show').append(div);
        document.getElementById('show').style.overflow='scroll';
        document.getElementById('show').style.backgroundColor=' rgba(11, 12, 26, 0.69)';
    });
}

randomReceipe=async()=>{
    let url=await fetch(`https://www.themealdb.com/api/json/v1/1/random.php`);
    let data=await url.json();
    let meal=data.meals;
    goToDetails(meal[0]);
}
randomReceipe()



goToDetails=(element)=>{
    document.getElementById('show').style.overflow='hidden';
    document.getElementById('show').style.backgroundColor='transparent';

    document.getElementById('receipe').innerHTML="";
    document.getElementById('query').value="";

    document.getElementById('show').innerHTML="";
    let div1=document.createElement('div');
    let div2=document.createElement('div');

    let strMealThumb=document.createElement('img');
    strMealThumb.src=element.strMealThumb;

    let strMeal=document.createElement('h3');
    strMeal.innerText=element.strMeal;

    let strInstructions=document.createElement('p');
    strInstructions.innerText=element.strInstructions;

    div1.append(strMealThumb);
    div2.append(strMeal,strInstructions);

    document.getElementById('receipe').append(div1,div2);
};
