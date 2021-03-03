<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>My Home Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
	<div class="container">
		<form class="form-signin" id="regFrom" action="/register">
			<h1 class="h3 mb-3 font-weight-normal">注册</h1>
			<label for="name" class="sr-only">姓名</label>
			<br>
			<input type="name" id="name" name="name" class="form-control"
				   placeholder="请输入姓名" required autofocus />
			<label for="password" class="sr-only">密码</label>
			<br>
			<input type="password" id="password" name="password" class="form-control"
				   placeholder="请输入密码" required autofocus />
			<br>
			<label for="email" class="sr-only">电子邮件</label>
				<input type="email" id="email" name="email" class="form-control"
				placeholder="请输入电子邮件" required autofocus />
			<br>
			<label for="phoneNumber" class="sr-only">电话号码</label>
			<input type="phoneNumber" id="phoneNumber" name="phoneNumber" class="form-control"
				   placeholder="请输入电话号码" required autofocus />
			<br>
			<button class="btn btn-lg btn-primary btn-block" type="submit">register
				in</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
		</form>
	</div>
</body>