
var $ = jQuery.noConflict();


// Page Loader
$(window).load(function () {
    
    "use strict";
	$('#loader').fadeOut();
});



    // jQuery for page scrolling feature - requires jQuery Easing plugin
$(function () {
    
    "use strict";
    
    $('a.page-scroll').bind('click', function (event) {
        var $anchor = $(this);
        $('html, body').stop().animate({
            scrollTop: $($anchor.attr('href')).offset().top - 68
        }, 1500, 'easeInOutExpo');
        event.preventDefault();
    });
});



// Highlight the top nav as scrolling occurs
$('body').scrollspy({
    target: '.navbar-fixed-top',
	offset: 70
	
});



// Closes the Responsive Menu on Menu Item Click
$('.navbar-collapse ul li a').click(function () {
    "use strict";
    $('.navbar-toggle:visible').click();
});
    
    
    
    
    /*----------------------------------------------------*/
    /*	Css3 Transition
    /*----------------------------------------------------*/

        $('*').each(function(){
            if($(this).attr('data-animation')) {
                var $animationName = $(this).attr('data-animation'),
                    $animationDelay = "delay-"+$(this).attr('data-animation-delay');
                $(this).appear (function() {
                    $(this).addClass('animated').addClass($animationName);
                    $(this).addClass('animated').addClass($animationDelay);
                });
            }
        });
    
            
        



////------- Testimonials Carousel
	
var testimonial = $("#testimonial-carousel");

testimonial.owlCarousel({
	navigation : true,
	pagination: true,
	slideSpeed : 2500,
	stopOnHover: true,
	autoPlay: 3000,
	singleItem: true,
	transitionStyle : "fade",
	navigationText: ['<i class="fa fa-chevron-left"></i>', '<i class="fa fa-chevron-right"></i>']
});

	

////------- Pricing Table

$(document).ready(function() {
 
  $(".pricing").owlCarousel({
        pagination: true,
        navigation : false,
        slideSpeed : 2500,
		stopOnHover: true,
    	autoPlay: 3000,
    	singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 4,
		transitionStyle : "fade",
		navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });
 
});


////------- Latest News

$(document).ready(function() {
 
  $(".latest-news").owlCarousel({
        pagination: true,
        navigation : false,
        slideSpeed : 2500,
		stopOnHover: true,
    	autoPlay: 4000,
    	singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 3,
		transitionStyle : "fade",
		navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });
 
  $(".latest-news1").owlCarousel({
        pagination: false,
        navigation : false,
        slideSpeed : 2500,
        stopOnHover: true,
        autoPlay: 4000,
        singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 2,
        transitionStyle : "fade",
        navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });

  $(".latest-news2").owlCarousel({
        pagination: false,
        navigation : false,
        slideSpeed : 2500,
        stopOnHover: true,
        autoPlay: 4000,
        singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 4,
        transitionStyle : "fade",
        navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });

  $(".latest-news3").owlCarousel({
        pagination: false,
        navigation : false,
        slideSpeed : 1000,
        stopOnHover: true,
        autoPlay: 3000,
        singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 4,
        navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });

  $(".latest-news4").owlCarousel({
        pagination: false,
        navigation : false,
        slideSpeed : 1000,
        stopOnHover: true,
        autoPlay: 3000,
        singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 4,
        navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });
    
 $(".latest-news5").owlCarousel({
        pagination: false,
        navigation : false,
        slideSpeed : 1000,
        stopOnHover: true,
        autoPlay: 3000,
        singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 2,
        navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });

  $(".latest-news6").owlCarousel({
        pagination: false,
        navigation : false,
        slideSpeed : 1000,
        stopOnHover: true,
        autoPlay: 3000,
        singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 4,
        navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });
});




// Team Carousel

$(document).ready(function() {
 
  $(".our-team").owlCarousel({
        pagination: true,
        slideSpeed : 2500,
		stopOnHover: true,
    	autoPlay: 3000,
        items: 4,
    	//singleItem:true,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
		transitionStyle : "fade",
		navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });
 
});



////------- Partner/CLients

$(document).ready(function() {
 
  $(".clients").owlCarousel({
        pagination: false,
        navigation : true,
        slideSpeed : 2500,
		stopOnHover: true,
    	autoPlay: 3000,
    	singleItem:false,
        itemsMobile : [550,1],
        itemsDesktopSmall : [991,2],
        items: 5,
		transitionStyle : "fade",
		navigationText: ['<i class="fa fa-chevron-left"></i>','<i class="fa fa-chevron-right"></i>']
  });
 
});




$ ( function () {

	$(".video").fitVids();
	
});





        // Tab------------------------------


$('#team a').click(function (e) {
  e.preventDefault()
  $(this).tab('show')
})




/*---------------------------------------------------*/
    /* Progress Bar
    /*---------------------------------------------------*/
    $(document).ready(function($) {
	"use strict";
    
        $('.skill-shortcode').appear(function() {
            $('.progress').each(function(){ 
                $('.progress-bar').css('width',  function(){ return ($(this).attr('data-percentage')+'%')});
            });
        },{accY: -100});
        
        
    });

function checktypesubmission(typeid){
    switch(typeid){
        case '1':

    }
}

$(document).ready(function(){
    if($("#track_id").find(":selected").val()){
        var trackid = $("#track_id").find(":selected").val();

        $.ajax({
            url:URL_G+'submission/selecttrack/',
            type:'post',
            data:'trackid='+trackid,
            success:function(g){
                //console.log(g);
                $("#session_id").empty();
                $("#session_id").append(g);
            }
        })
    }

    $("#track_id").on("change",function(){
        var trackid = $("#track_id").find(":selected").val();

        $.ajax({
            url:URL_G+'submission/selecttrack/',
            type:'post',
            data:'trackid='+trackid,
            success:function(g){
                $("#session_id").empty();
                $("#session_id").append(g);
            }
        })
    })

    if($("#submission_type").find(":selected").val()){

        var type = $("#submission_type").find(":selected").val();

        if(type == 'abstract'){
            $(".type").hide();
            $("#"+type).show();
            $("#extendabstract").show();
        }else{
            $(".type").hide();
            $("#"+type).show();
        }
    }
    
    var runcheck = setInterval(function(){
        var textabstract = $("#textabstract").val();

        var type = $("#submission_type").find(":selected").val();
        
        var fileextend = $("#fileextend").text();
        
        var fileextend1 = $("#fileextend1").text();

        if((textabstract.length < 1 && type !== 'abstract') || (fileextend1.length < 1 || fileextend.length <1 )){
            $("#submittt").show();
            $("#submittt1").hide();
        }else{
            $("#submittt1").show();
            $("#submittt").hide();
        }
    },1000);
    
    $("#submittt").click(function(){
        var div = bootbox.dialog({
                        title:'<center>ALERT</center>',
                        message: 'Firstly, you must fill abstract and extended abstract',
                        buttons: {
                            "close" : {
                                "label" : "<i class='fa fa-remove'></i> Close",
                                "className" : "btn-sm",
                                "callback": function() {
                                    div.modal("hide");
                                }
                            }
                        }
                    });
    });

    $("#submission_type").on("change",function(){
        var textabstract = $("#textabstract").val();

        var type = $("#submission_type").find(":selected").val();
        
        var fileextend = $("#fileextend").text();
        
        var fileextend1 = $("#fileextend1").text();

        if((textabstract.length < 1 && type !== 'abstract') || fileextend1.length < 1 || fileextend.length <1 ){
             var div = bootbox.dialog({
                        title:'<center>ALERT</center>',
                        message: 'Firstly, you must fill abstract and extended abstract',
                        buttons: {
                            "close" : {
                                "label" : "<i class='fa fa-remove'></i> Close",
                                "className" : "btn-sm",
                                "callback": function() {
                                    div.modal("hide");
                                }
                            }
                        }
                    });

            $("#submission_type option[value='abstract']").attr("selected","selected");

            ("#extendabstract").show();


        }else{
            if(type == 'abstract'){
                $(".type").hide();
                $("#"+type).show();
                $("#extendabstract").show();
            }else{
                $(".type").hide();
                $("#"+type).show();
            }
        }
    });

    $("#file-upload").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#fileextend").empty();
        $("#fileextend").append(namefile);
    });

    $("#file-upload1").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#filepaper").empty();
        $("#filepaper").append(namefile);
    });

    $("#file-upload2").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#fileposter").empty();
        $("#fileposter").append(namefile);
    });

    $("#file-upload3").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#filepresent").empty();
        $("#filepresent").append(namefile);
    });

    $("#file-upload4").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#fileextend1").empty();
        $("#fileextend1").append(namefile);
    });

    $("#file-upload5").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#filepaper1").empty();
        $("#filepaper1").append(namefile);
    });

    $("#file-upload6").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#fileposter1").empty();
        $("#fileposter1").append(namefile);
    });

    $("#file-upload7").on('change',function(e){
        var namefile =  e.target.files[0].name;
        $("#filepresent1").empty();
        $("#filepresent1").append(namefile);
    });
})
	
$("body").on('click','#deletesubmission',function(){
    var submisssion_id = $(this).attr('rel');
    var realink = $("#realink").attr('rel');
    var div = bootbox.dialog({
        title:'<center>DELETE</center>',
        message: 'You really want delete this submission ??',
        buttons: {
            "delete" : {
            "label" : "<i class='fa fa-trash'></i> Delete submission",
            "className" : "btn-sm btn-danger",
                "callback": function() {
                    $.ajax({
                        url:URL_G+'submission/delete1/',
                        type:'post',
                        data:'submisssion_id='+submisssion_id,
                        success:function(g){
                            //console.log(g);
                            if(g){
                                window.location.href=realink;
                            }
                        }
                    });
                }
            },
            "close" : {
                "label" : "<i class='fa fa-remove'></i> Close",
                "className" : "btn-sm",
                "callback": function() {
                    div.modal("hide");
                }
            }
        }
    });
});