function checkPass()
{
    var pass1=document.getElementById('password').value;
    var pass2=document.getElementById('confirm_pass').value;
    if(pass1.substr(0,pass2.length)!=pass2)
    {
        document.getElementById('warn_mismatched_pass').style.display='block';
        document.getElementById('warn_mismatched_pass').innerText='Password didn\'t match';
    }
    else
        document.getElementById('warn_mismatched_pass').style.display='none';
}