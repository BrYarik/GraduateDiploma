<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Techno-Shop</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/static/CSS/styles.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="/static/js/mainScript.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <a class="navbar-brand" href="/">
                <h3 class="goldtext">
                    Techno-SHOP
                </h3>
            </a>
<!--            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02"
                    aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>-->
            <div class="collapse navbar-collapse" id="home">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" href="/">
                            <h3 class="hometext">
                                Home
                            </h3>
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <div class="dropdown keep-open">
                        <li class="nav-item">
                            <a class="nav-link">
                                <a class="btn btn-secondary dropdown-toggle bg-dark btn-outline-dark" role="button"
                                   id="categories" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <h3 class="hometext">
                                        Categories
                                    </h3>
                                </a>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                <a class="dropdown-item">
                                    <a class="nav-link">
                                        <div class="btn-group dropright">
                                            <a class="btn btn-secondary dropdown-toggle bg-light btn-outline-light"
                                               role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <h3 class="greytext">
                                                    First Category
                                                </h3>
                                            </a>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item">
                                                    <a class="nav-link">
                                                        <h3 class="greytext">
                                                            First subcategory
                                                        </h3>
                                                    </a>
                                                </a>
                                            </div>
                                        </div>
                                    </a>
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item">
                                    <a class="nav-link">
                                        <div class="btn-group dropright">
                                            <a class="btn btn-secondary dropdown-toggle bg-light btn-outline-light"
                                               role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <h3 class="greytext">
                                                    Second Category
                                                </h3>
                                            </a>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item">
                                                    <a class="nav-link">
                                                        <h3 class="greytext">
                                                            First subcategory
                                                        </h3>
                                                    </a>
                                                </a>
                                            </div>
                                        </div>
                                    </a>
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item">
                                    <a class="nav-link">
                                        <div class="btn-group dropright">
                                            <a class="btn btn-secondary dropdown-toggle bg-light btn-outline-light"
                                               role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                                <h3 class="greytext">
                                                    Third Category
                                                </h3>
                                            </a>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item">
                                                    <a class="nav-link">
                                                        <h3 class="greytext">
                                                            First subcategory
                                                        </h3>
                                                    </a>
                                                </a>
                                            </div>
                                        </div>
                                    </a>
                                </a>
                            </div>
                        </li>
                    </div>
                    <li class="nav-item">
                        <a class="nav-link disabled" tabindex="-1" aria-disabled="true">
                            <h3 class="hometext">
                            Contacts:
                            </h3>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" tabindex="-1" aria-disabled="true">
                            <h3 class="hometext">
                                Email
                            </h3>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" tabindex="-1" aria-disabled="true">
                            <h3 class="hometext">
                                Phone number
                            </h3>
                        </a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control form-control-lg mr-sm-2" type="search" placeholder="Search">
                    <button class="btn btn-outline-light btn-lg my-2 my-sm-0" type="submit">Search</button>
                </form>
                <!-- Sign-in part start -->
                <form class="form-inline my-2 my-lg-0">
                    <div class="dropdown">
                        <button class="btn btn-outline-light bg-dark btn-secondary dropdown-toggle btn-lg my-2 my-sm-0"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                            Sign-in
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <form class="dropdown-menu p-4">
                                <div class="form-group">
                                    <label for="login">
                                        <h3 class="greytext">
                                            Login
                                        </h3>
                                    </label>
                                    <input type="email" class="form-control form-control-lg" id="login"
                                           placeholder="Login">
                                </div>
                                <div class="form-group">
                                    <label for="password">
                                        <h3 class="greytext">
                                            Password
                                        </h3>
                                    </label>
                                    <input type="password" class="form-control form-control-lg" id="password"
                                           placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <div class="form-check">
                                        <input type="checkbox" class="form-check-input" id="remember">
                                        <label class="form-check-label" for="remember">
                                            <h3 class="greytext">
                                                Remember me
                                            </h3>
                                        </label>
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-primary btn-outline-light bg-dark btn-lg">
                                    Sign in
                                </button>
                            </form>
                        </div>
                    </div>
                    <!-- Sign-in part end -->
                    <!-- Sign-up part start -->
                </form>
                <form class="form-inline my-2 my-lg-0">
                    <div class="dropdown">
                        <button class="btn btn-outline-light bg-dark btn-secondary dropdown-toggle btn-lg my-2 my-sm-0"
                                data-toggle="dropdown" data-display="static" aria-haspopup="true" aria-expanded="true">
                            Sign-up
                        </button>
                        <div class="dropdown-menu dropdown-menu-right dropdown-menu-lg-left">
                            <form class="dropdown-menu p-4">
                                <div class="form-group">
                                    <label for="regLogin">
                                        <h3 class="greytext">
                                            Login
                                        </h3>
                                    </label>
                                    <input type="text" class="form-control form-control-lg" id="regLogin"
                                           placeholder="Login">
                                </div>
                                <div class="form-group">
                                    <label for="regPassword">
                                        <h3 class="greytext">
                                            Password
                                        </h3>
                                    </label>
                                    <input type="password" class="form-control form-control-lg" id="regPassword"
                                           placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="regEmail">
                                        <h3 class="greytext">
                                            Email
                                        </h3>
                                    </label>
                                    <input type="email" class="form-control form-control-lg" id="regEmail"
                                           placeholder="example@gmail.com">
                                </div>
                                <button type="submit" class="btn btn-primary btn-outline-light bg-dark btn-lg"
                                        onclick="javascript: sendRegInfo()" id="regUser">
                                    Sign up
                                </button>
                            </form>
                        </div>
                    </div>
                    <!-- Sign-up part end -->
                </form>
            </div>
        </nav>
    </div>
    <div class="container" id="main"/>

    <script>
        // $('#regUser').click(sendRegInfo());
    </script>
</body>
</html>