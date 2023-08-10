//make top navigation bar responsive
function myFunction()
{
    var x = document.getElementById("myTopnav");


    if (x.className === "topnav") {
        x.className += " responsive";
        document.getElementById("content").style.zIndex="-1";
    }
    else  {
        x.className = "topnav";
        document.getElementById("content").style.zIndex="1";
    }

}


