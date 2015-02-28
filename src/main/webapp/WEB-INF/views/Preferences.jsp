<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Preferences</title>

<style type="text/css">
	
	body{
		font-family: "Times New Roman", Times, serif;
	}
	.header {
		background-color: black;
		color: white;
		text-align: left;
		padding-left:30px;
		padding-top:10px;
		padding: 5px;
	}
	
	.wrapper {
		margin: auto;
		width: 900px;
	}
	
	.footer {
		background-color: black;
		color: white;
		clear: both;
		text-align: center;
		padding: 5px;
		top: 400px
	}
	.formdiv{
		width:60%;
		margin:auto;
		float:left;
		padding:10px 10px 10px 10px;
		
	}
	.formcontent{
		float:left;
		padding: 3px 3px 3px 3px;
		line-height:2pt;
	}
	.divider{
	width:100%;
	height:30px;
	float:left;
	}
	.labelDiv{
		float:left;
		width:180px;
	}
	label{
		line-height:1;
	}
	
	
</style>


</head>
<body>
	PreferenceId hi ${Gender } ${Id } ${FoodPref } ${RoomType}
	${SmokingHabit } ${Alcohol } ${NoiseLevel } ${Pets } ${AcademicMajor }

	<div class="wrapper">
	<div class="header">
		<h1>Preferences</h1>
	</div>
	<div class="divider"></div>
	
	<div id="formDiv" class="formdiv">
		<form>
			<div class="formcontent">
			<div class="labelDiv"><label name="label_gender">Gender</label></div>
				 <select name="gender">
					<option val="male" >Male</option>
					<option val="female" ${Gender == 'female' ? 'selected="selected"' : ''}>Female</option>
				</select> 
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
			<div class="labelDiv"><label name="label_foodPref">Food Preference</label> </div>
				<select name="foodpref">
					<option val="none">None</option>
					<option val="veg" ${FoodPref == 'veg' ? 'selected="selected"' : ''}>Vegetarian</option>
					<option val="non-veg" ${FoodPref == 'non-veg' ? 'selected="selected"' : ''}>Non Vegetarian</option>
			</select> 
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
			<div class="labelDiv"><label name="label_smoke">Smoking</label> </div>
			<select name="smoking">
				<option val="yes">Allowed</option>
				<option val="no" ${SmokingHabit == 'no' ? 'selected="selected"' : ''}>Not Allowed</option>
			</select> 
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
			<div class="labelDiv"><label name="label_alcohol">Alcohol</label> </div>
				<select name="alcohol">
					<option val="yes">Allowed</option>
					<option val="no" ${Alcohol == 'no' ? 'selected="selected"' : ''}>Not Allowed</option>
				</select> 
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
			<div class="labelDiv"><label name="label_roomtype">Room Type</label> </div>
				<select name="roomtype">
					<option val="sharing">Sharing</option>
					<option val="non-sharing" ${RoomType == 'non-sharing' ? 'selected="selected"' : ''}>Non Sharing</option>
				</select> 
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
			<div class="labelDiv"><label name="label_noise">Noise Tolerance</label> </div>
				<select name="noiselevel">
					<option val="high">High</option>
					<option val="low" ${NoiseLevel == 'low' ? 'selected="selected"' : ''}>Low</option>
				</select> 
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
			<div class="labelDiv"><label name="label_pets">Pets</label> </div>
				<select name="pets">
					<option val="no">No</option>
					<option val="yes" ${Pets == 'yes' ? 'selected="selected"' : ''}>Yes</option>
				</select> 
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
			<div class="labelDiv"><label name="label_major">Academic Major</label> </div>
				<input type="text" name="academicMajor" value="<%if(request.getAttribute("AcademicMajor")!=null) { out.println(request.getAttribute("AcademicMajor"));}  %>"/>
			</div>
			<div class="divider"></div>
			
			<div class="formcontent">
				<button name="submitButton">Submit</button>	
		
			</div>
		</form>
	</div>
		
	</div>


</body>
</html>