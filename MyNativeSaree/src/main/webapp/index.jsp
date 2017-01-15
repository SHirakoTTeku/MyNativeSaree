<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.col-xs-12{
height:100px
background-color:green;
color:yellow;
text-align: center;
}
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 50%;
      margin: auto;
  }
  </style>
</head>
<body>
<jsp:include page="Templates/template.jsp"></jsp:include><br><br>
<div class="container">


<div class="row">
<div class="col-lg-12">
<div class="panel panel-default">
<div class="panel-heading">
<div class="glyphicon glyphicon-shopping-cart"></div>
Store
</div>
<center></center><div class="panel-body">

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="Product_Images/pimg1.jpg" alt="Chania" width="360" height="245">
      </div>

      <div class="item">
        <img src="Product_Images/pimg2.jpg" alt="Chania" width="360" height="245">
      </div>
    
      <div class="item">
        <img src="Product_Images/pimg3.jpg" alt="Flower" width="360" height="245">
      </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div></center>
</div>
</div>
</div>

</div>

</body>
</html>
