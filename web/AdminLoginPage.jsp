<%@taglib uri="/struts-tags" prefix="s" %>

<h1>
    SIGN IN SECTION
</h1>

<s:form action="signinaction">
    <s:textfield name="userId" label="User Id"/>
    <s:password name="pass" label="Password"/>
    <s:submit value="Submit" name="Login"/>
</s:form>