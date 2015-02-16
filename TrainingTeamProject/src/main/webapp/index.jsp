<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Poker Planning</title>
</head>

<body>
	<b>Poker Planning</b>
	<p>
	<%=new java.util.Date()%>
   </p>
	<div id="wrapper">
		<div id="leftColumn">
			<h1>Task</h1>
			<p>Description</p>
		</div>
		<div id="rightColumn">
			<p>Choose a card:</p>
			<table>
				<tr>
					<td><img src="images/1.jpg" height="180" width="126" /></td>
					<td><img src="images/2.jpg" height="180" width="126" /></td>
					<td><img src="images/3.jpg" height="180" width="126" /></td>
				</tr>
				<tr>
					<td><img src="images/5.jpg" height="180" width="126" /></td>
					<td><img src="images/8.jpg" height="180" width="126" /></td>
					<td><img src="images/13.jpg" height="180" width="126" /></td>
				</tr>
			</table>

			<p>Elapsed time:</p>

			<div id="showtime" style="font-size: 50px; font-weight: 800;">0
				: 0</div>
			<script type="text/javascript">
				var stmints = 0;
				var stseconds = 0;
				var stzecsec = 0;

				function toAutoStop() {
					alert('Your time has expired!');
				}

				var zecsec = 0;
				var seconds = 0;
				var mints = 0;
				var startchron = 0;

				function chronometer() {
					if (startchron == 1) {
						zecsec += 1;
						if (zecsec > 9) {
							zecsec = 0;
							seconds += 1;
						}
						if (seconds > 59) {
							seconds = 0;
							mints += 1;
						}
						document.getElementById('showtime').innerHTML = mints
								+ ' : ' + seconds + '<sub>';
						// when the time is at 30 seconds the vote has expired
						if (seconds == 10)
							toAutoStop();
						else
							setTimeout("chronometer()", 100);
					}
				}

				function startChr() {
					startchron = 1;
					chronometer();
				}

				function stopChr() {
					startchron = 0;
				}

				function resetChr() {
					zecsec = 0;
					seconds = 0;
					mints = 0;
					startchron = 0;
					document.getElementById('showtime').innerHTML = mints
							+ ' : ' + seconds + '<sub>';
				}
				//startChr();
			</script>
			<button onclick="startChr();">Start Voting</button>
			<button onclick="resetChr();">Reset Voting</button>
		</div>
	</div>

</body>
</html>