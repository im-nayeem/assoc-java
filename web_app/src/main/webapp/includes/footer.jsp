<%--
  Created by IntelliJ IDEA.
  User: Nayeem
  Date: 24-Aug-22
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>


<div class="footer">

</div>

<script>
    //if window is small show assoc name and univ name in two lines and show active page in the place of font icon(assoc name abbreviation)
    if (window.screen.width < 800) {
        document.getElementsByClassName('name')[0].children[0].style.display = 'none';
        document.getElementsByClassName('name')[0].children[1].style.display = 'block';

        //when window is small show active page name instead of assocName in name_in_nav
        document.getElementsByClassName('name_in_nav')[0].text = document.getElementsByClassName('active')[0].text;

    }
    else {
        document.getElementsByClassName('name')[0].children[1].style.display = 'none';

        //if window is large increase font size of assoc name
        document.getElementsByClassName('name')[0].children[0].style.fontSize='25px';
    }

</script>
</body>

</html>