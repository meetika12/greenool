                                                    
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-dojo-tags" prefix="s1" %>
<s1:head debug="true"/>

<html>
    <head>
        <title>Greenool</title>
        
    </head>                
<body>
    
                        <h1>BOOK YOUR SERVICES</h1>

<s:form action="signupaction"   enctype="multipart/form-data">
    
    <s:textfield name="userId" label="User Id" required="true"/>
    <s:textfield name="userName" label="User Name" required="true"/>
    <s:textfield name="contact" label="Contact" required="true"/>
    <s:textfield name="mailId" label="E-Mail Id" required="true"/>
    <s:textarea name="address" label="Address" required="true"/>
    
    <s:select list="{'Select Zone','Vijay Nagar','Sapna Sangeeta','Sudama Nagar','Aerodrum Road','Palasia','NiranjanPur'}" 
              label="Pickup Zone" name="pickup" required="true"/>
   
    <s:select list="{'Select Zone','Vijay Nagar','Sapna Sangeeta','Sudama Nagar','Aerodrum Road','Palasia','NiranjanPur'}" 
              label="Destination Zone" name="drop" required="true"/>
    
    <s1:datetimepicker label="Start Date" name="startdate" required="true"/> 
        
    <s1:datetimepicker label="Pickup Time" name="pickuptime" type="time" required="true"/>
        
    <s:radio list="{'Female','Male'}" label="Gender" name="gender" required="true"/>
    
    <s:submit value="Submit"/>
    <s:reset value="Clear"/>
    
</s:form>
                        
                        
</body>

</html>

<!--<style>
                            body
                            {
                                padding-top: 100px;
                                background: url(images/project3.jpg) no-repeat 0px 0px;
                                background-size:cover;
                                -webkit-background-size: cover;
                                -o-background-size: cover;
                                -ms-background-size: cover;
                                -moz-background-size: cover;
                                min-height: 855px;
                            }
                            .register{
                                padding-top: 30px;
                                padding-left: 15%;
                                
                            }
                            h1{
                                padding-top: 20px;
                                padding-left: 15%;
                            }
                        </style>                        -->