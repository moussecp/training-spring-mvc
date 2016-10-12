<html>
<head>
    <title>Hello World Spring MVC</title>
        <style type="text/css">
            body {
                background-color: lavender;
                font-family: Verdana, Serif, serif;
            }
        </style>
    </head>
<body>

    <div style="text-align: center">
        <h2>
            This page has been found thanks to the HandlerMapping and the ViewResolver.
        </h2>
        <h2>
            A controller knows that a message should be built to publish the right model to the corresponding view and display it here:
        </h2>
        <label>
            <textarea rows="6" cols="60">
                ${message}
            </textarea>
        </label>
        <h2>GOOD JOB!</h2>
        <img src="http://4.bp.blogspot.com/-Q5tVyMkoE_0/UUw8v4cgbAI/AAAAAAAAA4s/5DwyopBdidc/s1600/pulp_thumb+christian+d.jpg"
             width="500">
    </div>
</body>
</html>