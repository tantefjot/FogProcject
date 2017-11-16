<%-- 
    Document   : CarportConstrutor
    Created on : 16-11-2017, 12:58:39
    Author     : Rikke Nielsen 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Design og pris beregner</title>
    </head>



<table BORDER="0" cellspacing="0" cellpadding="0">
        <TR>
            <TD rowspan="2" width="60">Højde:</td>
            <TD align="RIGHT" rowspan="2" width="90">&nbsp<b>
                    <input type="text" size="3" value=""  > cm.</b>&nbsp;</td>
        </tr>
    </table>
    
    <table BORDER="0" cellspacing="0" cellpadding="0">
        <TR>
            <TD rowspan="2" width="60">Længde:</td>
            <TD align="RIGHT" rowspan="2" width="90">&nbsp<b>
                    <input type="text" size="3" value=""  > cm.</b>&nbsp;</td>
        </tr>
    </table>

</td>


    <table BORDER="0" cellspacing="0" cellpadding="0">
        <TR>
            <TD rowspan="2" width="60">Bredde:</td>
            <TD align="RIGHT" rowspan="2" width="90">&nbsp;<b>
                    <input type="text" size="3" value="" > cm.</b>&nbsp;</td>

    </table>

    <br>
    Tagbeklædning:&nbsp;
    <select name="tagbeklaedning" size="1" onchange="skift_tagbekl(this), knapperOp()">
        <option value="image/carporte/img/dobbel_s.jpg">teglsten - sort
        <option value="image/carporte/img/vinge_teglsten.jpg">teglsten - rød
        <option value="image/carporte/img/b7_p.jpg">Eternitbølgeplade - Sort
        <option value="image/carporte/img/rodtag.jpg">Eternitbølgeplade - rød
        <option value="image/carporte/img/bruntag.jpg">Eternitbølgeplade- mokka

    </select>

    <br>&nbsp;<br>


    Taghældning:&nbsp; &nbsp;&nbsp;
    <select name="taghaeldning_vaelger" size="1" onchange="skiftSpids_taghaeldning(this), knapperOp()">
        <option value="image/carporte/img/15.gif"> 0 grader
        <option value="image/carporte/img/15.gif">15 grader
        <option value="image/carporte/img/20.gif">20 grader
        <option value="image/carporte/img/25.gif">25 grader
        <option value="image/carporte/img/30.gif">30 grader
        <option value="image/carporte/img/35.gif">35 grader
    </select><br>&nbsp;<br>

    <table BORDER="0" cellspacing="0" cellpadding="0">


    </table>


    <table>

        &nbsp;<br>
        <TR>
            <TD valign="TOP"><b>Prisoverslag inkl. moms:</b></td>
            <TD valign="TOP" align="RIGHT"><input type="text" size="5" readonly value="totalpris" name="prisOutput"><b> kr.</b> (+ evt. fragt)</td>
        </tr>
    </table>
    <TABLE WIDTH="100%" BORDER="0">
        <TR>

            <TD VALIGN="top" ROWSPAN="9" WIDTH="10">&nbsp;</TD>
            &nbsp;<br>
        &nbsp;<br>
        <TD WIDTH="66"><A NAME="formular">Navn på dit design:</A></TD>
        <TR><INPUT TYPE="text" SIZE="30" NAME="realname" tabindex="1" value="">
        <TD>&nbsp;</TD>
        <TD><INPUT TYPE="submit" VALUE="Gem design" tabindex="9"></TD>
    </TR>
</TABLE>

&nbsp;<br>
</body>
</html>

