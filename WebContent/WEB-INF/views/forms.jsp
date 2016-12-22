<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
	font-family: arial, sans-serif;
	font-size: 14px;
}
</style>
</head>

<body>
	<h1 style="text-decoration: underline;">Forms</h1>
	<h1>Add Flight and airplane</h1>
	<form method="POST" action="AddFlight">
		form: <select name="from_destination">
			<option value="London">London</option>
			<option value="Marrakech">Marrakech</option>
			<option value="New_york">New york</option>
			<option value="Paris">Paris</option>
			<option value="Casablanca">Casablanca</option>
			<option value="Los_Anglos">Los Anglos</option>
			<option value="Doha">Doha</option>
			<option value="Dubia">Dubia</option>
			<option value="New_jersy">New jersy</option>
			<option value="Rome">Rome</option>
		</select> <br /> <br /> 
		To: <select name="to_destination">
			<option value="London">London</option>
			<option value="Marrakech">Marrakech</option>
			<option value="New_york">New york</option>
			<option value="Paris">Paris</option>
			<option value="Casablanca">Casablanca</option>
			<option value="Los_Anglos">Los Anglos</option>
			<option value="Doha">Doha</option>
			<option value="Dubia">Dubia</option>
			<option value="New_jersy">New jersy</option>
			<option value="Rome">Rome</option>
			</select> <br />
		<h4>Flight Time :</h4><br />
		Year : <select name="year">
			<option value="2016">2016</option>
			<option value="2017">2017</option>
			<option value="2018">2018</option>
			<option value="2019">2019</option>
			<option value="2020">2020</option>
			<option value="2021">2021</option>
			<option value="2022">2022</option>
			<option value="2023">2023</option>
			<option value="2024">2024</option>
			<option value="2025">2025</option>
		</select> 
		Month : <select name="month">
			<option value="1">January</option>
			<option value="2">February</option>
			<option value="3">March</option>
			<option value="4">April</option>
			<option value="5">May</option>
			<option value="6">June</option>
			<option value="7">July</option>
			<option value="8">August</option>
			<option value="9">September</option>
			<option value="10">October</option>
			<option value="11">November</option>
			<option value="12">December</option>
		</select> 
		Day :<select name="day">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
			<option value="9">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option>
			<option value="22">22</option>
			<option value="23">23</option>
			<option value="24">24</option>
			<option value="25">25</option>
			<option value="26">26</option>
			<option value="27">27</option>
			<option value="28">28</option>
			<option value="29">29</option>
			<option value="30">30</option>
			<option value="31">31</option>
			</select>
		Hour : <select name="hour">
			<option value="0">00</option>
			<option value="1">01</option>
			<option value="2">02</option>
			<option value="3">03</option>
			<option value="4">04</option>
			<option value="5">05</option>
			<option value="6">06</option>
			<option value="7">07</option>
			<option value="8">08</option>
			<option value="9">09</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option>
			<option value="22">22</option>
			<option value="23">23</option>
		</select> 
		Minute : <select name="minute">
			<option value="1">00</option>
			<option value="1">01</option>
			<option value="2">02</option>
			<option value="3">03</option>
			<option value="4">04</option>
			<option value="5">05</option>
			<option value="6">06</option>
			<option value="7">07</option>
			<option value="8">08</option>
			<option value="9">09</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option>
			<option value="22">22</option>
			<option value="23">23</option>
			<option value="24">24</option>
			<option value="25">25</option>
			<option value="26">26</option>
			<option value="27">27</option>
			<option value="28">28</option>
			<option value="29">29</option>
			<option value="30">30</option>
			<option value="31">31</option>
			<option value="32">32</option>
			<option value="33">33</option>
			<option value="34">34</option>
			<option value="35">35</option>
			<option value="36">36</option>
			<option value="37">37</option>
			<option value="38">38</option>
			<option value="39">39</option>
			<option value="40">40</option>
			<option value="41">41</option>
			<option value="42">42</option>
			<option value="43">43</option>
			<option value="44">44</option>
			<option value="45">45</option>
			<option value="46">46</option>
			<option value="47">47</option>
			<option value="48">48</option>
			<option value="49">49</option>
			<option value="50">50</option>
			<option value="51">51</option>
			<option value="52">52</option>
			<option value="53">53</option>
			<option value="54">54</option>
			<option value="55">55</option>
			<option value="56">56</option>
			<option value="57">57</option>
			<option value="58">58</option>
			<option value="59">59</option>
			<option value="60">60</option>
		</select> <br /> <br />
		Price : <input type="text" name="price"></input> <br /> <br /> 

		<h4>Airplane</h4>
		Plane Make : <input type="text" name="plan_make"></input><br /><br />
		Model Name : <input type="text" name="model_name"></input><br /><br />
		capacity : <input type="text" name="capacity"></input><br /><br />
		<button name="button">Add airplane and Flight</button></form>
		<h1>Pilot</h1>
		<form action="CreatePiloteAndAddToFlight" method="POST">
			First Name :
			<input type="text" name="firstName" /><br /> <br />

			last Name :
			<input type="text" name="lastName" /><br /> <br />
			
			License :
			<input type="text" name="license" /><br /> <br />
			
			Rank:
			<select name="rank">
				<option value="Captain">Capitain</option>
				<option value="Fisrt_Officer">First Officer</option>
				<option value="Junior_Officer">Junior Officer</option>	
			</select><br /> <br />
			Flight ID:
			<input name="fid" type="text"></input><br /> <br />
			<button type="submit">Add Pilot to Flight</button>
		</form>
		<h1>Passenger</h1>
		<form action="AddPassenger" method="POST">
			First Name :
			<input type="text" name="firstName" /><br /> <br />

			last Name :
			<input type="text" name="lastName" /><br /> <br />
			
			Date of birth :
			<input type="text" name="dob" placeholder="MM/DD/YYYY"/><br /> <br />
			
			Gender:
			<select name="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>	
			</select><br /> <br />
			<button type="submit">Add Passenger</button>
		</form>
		<h1>Add Passenger To Flight</h1>
		<form action="AddPassengerToFlight" method="POST">
		Passenger ID : Add a passenger with the id
			<input type="text" name="pid" /><br /> <br />
		Flight ID : To the flight with the id
			<input type="text" name="fid" /><br /> <br />
			<button type="submit">Add Passenger to Flight</button><br /> <br />
		</form>
		<h1>Add Flight To Passenger</h1>
		<form action="AddFlightTicketToPassenger" method="POST">
		Flight ID : add a ticket of a flight with the id
			<input type="text" name="fid" /><br /> <br />
		Passenger ID : for the passenger with the id
			<input type="text" name="pid" /><br /> <br />
			<button type="submit">Add Flight to passenger</button><br /> <br />
		</form>

</body>
</html>