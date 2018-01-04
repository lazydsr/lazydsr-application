<!DOCTYPE html>
<html lang="zh" class="no-js">
<head>
    <#include "public/base.ftl"/>
    <!--
      login
      PROJECT_NAME: lazydsr-application
      PACKAGE_NAME: templates.ftl
      Created by Lazy on 2018/1/3 22:22
      Version: 0.1
      Info: @TODO:...
   -->
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/static/login/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/login/css/demo.css" />
    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="${ctx}/static/login/css/component.css" />
    <!--[if IE]>
    <script src="js/html5.js"></script>
    <![endif]-->
    <script src="${ctx}/static/plugins/jquery/js/jquery.min.js"></script>
</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>欢迎你</h3>
                <form action="#" name="f" method="post">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input name="logname" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
                    </div>
                    <div class="mb2"><a id="login" class="act-but submit" href="javascript:;" style="color: #FFFFFF">登录</a></div>
                    <div style="text-align:center;"><span id="msg"></span></div>
                </form>
            </div>
        </div>
    </div>
</div><!-- /container -->
<script src="${ctx}/static/login/js/TweenLite.min.js"></script>
<script src="${ctx}/static/login/js/EasePack.min.js"></script>
<script src="${ctx}/static/login/js/rAF.js"></script>
<script src="${ctx}/static/login/js/demo-1.js"></script>
<div style="text-align:center;">
    <script>
        $(function () {
            $("#login").click(function () {
                $("#msg").text("密码错误，请重试");
            });
        });
    </script>
</div>
</body>
</html>