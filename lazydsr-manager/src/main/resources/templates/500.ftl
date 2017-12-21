<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Server Error</title>
    <style>
        ::-moz-selection {
            background: #b3d4fc;
            text-shadow: none;
        }

        ::selection {
            background: #b3d4fc;
            text-shadow: none;
        }

        html {
            padding: 30px 10px;
            font-size: 20px;
            line-height: 1.4;
            color: #737373;
            background: #f0f0f0;
            font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
            -webkit-text-size-adjust: 100%;
            -ms-text-size-adjust: 100%;
        }

        body {
            max-width: 550px;
            _width: 550px;
            padding: 30px 20px 50px;
            border: 1px solid #b3b3b3;
            border-radius: 4px;
            margin: 0 auto;
            box-shadow: 0 1px 10px #a7a7a7, inset 0 1px 0 #fff;
            background: #fcfcfc;
        }

        h1 {
            margin: 0 10px;
            font-size: 50px;
            text-align: center;
        }

        h1 span {
            color: #bbb;
        }

        h3 {
            margin: 1.5em 0 0.5em;
        }

        p {
            margin: 1em 0;
        }

        ul {
            padding: 0 0 0 40px;
            margin: 1em 0;
        }

        .container {
            max-width: 500px;
            _width: 500px;
            margin: 0 auto;
        }

    </style>
</head>
<body>
<div class="container">
    <h1>Server Error</h1>
    <p>Sorry, but there was an error with the server that prevented this page from being displayed.</p>
    <p>${resultBody.msg}</p>
    <p>${resultBody.datetime}</p>
    <p>${resultBody.data.path}</p>
    <p>${resultBody.data.clentIp}</p>
    <p>${resultBody.data.errorMessage}</p>





<#--<#list resultBody.data.keySet() as key>-->
<#--<option value="${key}">-->
<#--${resultBody.data.get(key)}-->
<#--</option>-->
<#--</#list>-->
</div>
</body>
</html>
