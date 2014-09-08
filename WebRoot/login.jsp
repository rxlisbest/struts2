<%@ include  file="header.jsp"%>
<div class="left-sidebar">
  
  <div class="row-fluid">
    
    <div class="span12">
      <div class="widget">
        <div class="widget-header">
          <div class="title">
            Login
          </div>
          <span class="tools">
            <a class="fs1" aria-hidden="true" data-icon="&#xe090;"></a>
          </span>
        </div>
        <div class="widget-body">
          <div class="span3"></div>
          <div class="span6">
            <div class="sign-in-container">
              <form action="/logon" class="login-wrapper" method="post">
                <div class="header">
                  <div class="row-fluid">
                    <div class="span12">
                      <h3>Login<img src="img/logo1.png" alt="Logo" class="pull-right"></h3>
                      <p>${session.USER_NAME}</p>
                    </div>
                  </div>
                 
                </div>
                <div class="content">
                  <div class="row-fluid">
                    <div class="span12">
                      <input class="input span12 email" id="" name="username" placeholder="Email" required="required" type="UserName" value="">
                    </div>
                  </div>
                  <div class="row-fluid">
                    <div class="span12">
                      <input class="input span12 password" id="" name="password" placeholder="Password" required="required" type="password">
                    </div>
                  </div>
                </div>
                <div class="actions">
                  <input class="btn btn-danger" name="Login" type="submit" value="Login" >
                  <a class="link" href="#">Forgot Password?</a>
                  <div class="clearfix"></div>
                </div>
              </form>
            </div>
          </div>
          <div class="span3"></div>
          <div class="clearfix"></div>
        </div>
      </div>
    </div>
    
  </div>
  

</div>



<div class="right-sidebar">
            
            <div class="wrapper">
              <a href="#myModal" role="button" class="btn btn-large btn-warning2 btn-block" data-toggle="modal">
                Launch demo modal
              </a>
              
              <!-- Modal -->
              <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    ×
                  </button>
                  <h3 id="myModalLabel">
                    Modal header
                  </h3>
                </div>
                <div class="modal-body">
                  <p>
                    One fine body�?                  </p>
                </div>
                <div class="modal-footer">
                  <button class="btn" data-dismiss="modal" aria-hidden="true">
                    Close
                  </button>
                  <button class="btn btn-primary">
                    Save changes
                  </button>
                </div>
              </div>
            </div>
            
            <div class="wrapper">
              <button class="btn btn-large btn-info btn-block" type="button">
                Large button
              </button>
              <button class="btn btn-warning btn-block" type="button">
                Default button
              </button>
              <button class="btn btn-small btn-success btn-block" type="button">
                Small button
              </button>
              <button class="btn btn-small btn-warning2 btn-block" type="button">
                Small button
              </button>
              <button class="btn btn-mini btn-primary btn-block" type="button">
                Mini button
              </button>
              <button class="btn btn-small btn-inverse btn-block" type="button">
                Small button
              </button>
              <button class="btn btn-small btn-block" type="button">
                Small button
              </button>
              <a href="#" class="btn btn-mini btn-warning2 disabled btn-block">
                Primary link disabled
              </a>
              <a href="#" class="btn btn-mini disabled btn-block">
                Link disabled
              </a>
            </div>
            
            
            
            <div class="wrapper">
              <button class="btn btn-block btn-info" type="button">
                Block level button
              </button>
            </div>
            
            <div class="wrapper">
              <div class="btn-toolbar no-margin">
                <div class="btn-group">
                  <a href="#" class="btn btn-danger">
                    Plane
                  </a>
                  <a href="#" class="btn btn-inverse">
                    <i class="icon-plane icon-white">
                    </i>
                  </a>
                </div>
                <div class="btn-group">
                  <a href="#" class="btn btn-info">
                    Fire
                  </a>
                  <a href="#" class="btn btn-warning">
                    <i class="icon-white icon-fire">
                    </i>
                  </a>
                </div>
              </div>
            </div>
            
          </div>

    
<script src="js/jquery.min.js">
</script>
<script src="js/bootstrap.js">
</script>


<script type="text/javascript">
  //Tooltip
  $('a').tooltip('hide');

  //Popover
  $('.popover-pop').popover('hide');


  //Collapse
  $('#myCollapsible').collapse({
    toggle: false
  })
</script>
<%@ include  file="footer.jsp"%>