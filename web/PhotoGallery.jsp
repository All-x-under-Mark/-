<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 23.03.2020
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <link rel="stylesheet" href="style.css">
    <title>Фотогалерея</title>
</head>
<body>
<header>
    <div class="header-bg">
        <h1>ФК Юность</h1>
    </div>
</header>

<div class="content-gradient">
    <div class="content-bg">
        <div class="content-white">

            <aside>

                <div class="interest">
                    <div class="conteiner-text-registrbloc">
                        <div><input class="textreg" type="text" name="textLogin" placeholder="Логін"></div>
                        <div><input class="textreg" type="text" name="textParol" placeholder="Пароль"></div>

                    </div>
                    <div class="container-submit">
                                        <span>
                                        <input type="submit" class="btn btn-info" value="Регістрація">
                                            <input type="submit" class="btn btn-info" value="Логін">
                                    </span>
                    </div>
                </div>

                <ul class="menu">


                    <li><a href="index.jsp">Головна</a></li>
                    <li><a href="Command.jsp">Команда</a> <br></li>
                    <li><a href="Table.jsp">Таблиця</a> <br></li>
                    <li><a href="History.jsp">Історія</a> <br></li>
                    <li class="current"><span>Фотогалерея</span></li>
                    <li><a href="Achievements.jsp">Досягнення</a></li>


                </ul>


            </aside>

            <article>
                <h1 class="dixotomia">Метод дихотомии</h1>

                <p>Ловля льва методом дихотомии основана на последовательном делении пустыни на две части. Вначале
                    разбиваем пустыню пополам, как показано на рис.&nbsp;1, после чего отбрасываем ту часть пустыни, где
                    льва нет (на иллюстрации она помечена темным цветом). </p>
                <figure>
                    <p><img src="images/fig4-1.png" alt="Рис. 4" width="381" height="252"/></p>
                    <figcaption>Рис. 1. Первый этап метода дихотомии</figcaption>
                </figure>
                <p>На следующем шаге оставшуюся часть снова делим пополам, но уже горизонтально, при этом отбрасывая
                    часть пустыни, где льва нет (рис.&nbsp;2).</p>
                <figure>
                    <p><img src="images/fig4-2.png" alt="Рис. 2" width="381" height="252"/></p>
                    <figcaption>Рис. 2. Второй этап метода дихотомии</figcaption>
                </figure>
                <p>Последовательное деление пустыни по вертикали и горизонтали продолжается до тех пор, пока оставшаяся
                    часть по размерам не будет сопоставима с размерами клетки. Остается только накрыть полученный
                    участок клеткой и лев окажется пойман.</p>
                <p>На рис.&nbsp;3 показаны итерации ловли льва методом дихотомии.</p>
                <figure>
                    <p><img src="images/fig4-3.png" alt="Рис. 3" width="381" height="252"/></p>
                    <figcaption>Рис. 3. Количество итераций</figcaption>
                </figure>
            </article>
        </div>
    </div>
</div>

<footer>

    <div class="footer-bg">
        <div class="copyright">
            <p><strong>Информаційний сайт ФК "Юність" с. Мойсівка</strong></p>
            <p>&copy; Олександр Маркович</p>
        </div>
    </div>
</footer>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
