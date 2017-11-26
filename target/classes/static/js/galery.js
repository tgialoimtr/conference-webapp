$(document).ready(function() {

    $("#file-upload").change(function(){
        $("#userimg").show();
        readURL(this,'userimg');
    });

    $("#userimg").click(function(){
        $("#file-upload").trigger('click');
    });

});

function readURL(input,container) {

    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#'+container).attr('src', e.target.result);
        };

        reader.readAsDataURL(input.files[0]);
    }
}
