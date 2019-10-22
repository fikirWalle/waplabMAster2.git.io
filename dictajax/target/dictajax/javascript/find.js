$(function () {

    // $(document).ajaxStart(function() {
    //     $("#loader").show();
    // }).ajaxStop(function() {
    //     $("#loader").hide();
    // });

    $("#loading").hide();
    $("#btnsearch").click(function (e) {
        $("#loading").show();


        $.ajax({
            url : 'search',
            type : 'GET',
            data : {
                wordname : $('#wordname').val(),

            },
            success : function (data) {

                if(data.length<=0)
                    $("#notfound").append("<p id='error'>\""+$("#wordname").val()+"\" not found</p>");
                else
                {

                    var ol="<div><ol><strong>"+$("#wordname").val()+"</strong>";

                   // var ol="<div><strong>"+$("#wordname").val().wordtype+"</strong></div>";
                  //  $("#content").append(ol);
                    $("#content").append(ol);
                        var i=1;

                      while(i<=data.length){

                          $('#content').html(data);
                               i++;
                      }




                }
                $("#loading").hide();

            },
            error : function (xhr ,status ,exception ) {
                console.log('Error happened');
            },
            complete : function () {
                $("#loader").hide();
            }
        });
    });
});