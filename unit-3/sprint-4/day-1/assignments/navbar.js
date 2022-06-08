function navbar(){
    return`
    <h1 id="home">Shubhra's</h1>
    <div>
        <h2>
            <a href="homePage.html">
                Receipe Kitchen
            </a>
        </h2>
        <input oninput="showInput()" placeholder="Search Receipe" id="query" />
        <h2 id="login">
            <a href="login.html">
                Log In
            </a>
        </h2>
        <h2 id="signup">
            <a href="signup.html">
                Sign Up
            </a>
        </h2>
        <h3 id="userName"></h3>
        <h3 id="logout"></h3>
    </div>`
};
export default navbar;