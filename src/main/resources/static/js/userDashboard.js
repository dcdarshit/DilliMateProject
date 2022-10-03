/*$(document).ready(function() {
	
    $(".location-list").click(function(){
	    $(".food-list").removeClass("active-links");
        $(".hotel-list").removeClass("active-links");
        $(".health-list").removeClass("active-links");
        $(".cab-list").removeClass("active-links");
        $(".guide-list").removeClass("active-links");
	    $(".location-list").addClass("active-links");
        
        $(".welcome-page").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");    
        $(".dashboard-food-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");   
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-location-list").css("display", "block");
     });

    $(".museum-list").click(function() {       
        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");       
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");    
        $(".dashboard-food-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");   
        $(".dashboard-cafe-list").css("display", "none");       
        $(".dashboard-museum-list").css("display", "block");
     });

     $(".monument-list").click(function(){       
        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");       
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");    
        $(".dashboard-food-list").css("display", "none"); 
        $(".dashboard-restaurant-list").css("display", "none");   
        $(".dashboard-cafe-list").css("display", "none");            
        $(".dashboard-monument-list").css("display", "block");
     });

    $(".food-list").click(function() {
	    $(".location-list").removeClass("active-links");
        $(".hotel-list").removeClass("active-links");
        $(".health-list").removeClass("active-links");
        $(".cab-list").removeClass("active-links");
        $(".guide-list").removeClass("active-links");    
        $(".food-list").addClass("active-links");

        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");    
        $(".dashboard-food-list").css("display", "block");
        $(".dashboard-restaurant-list").css("display", "none");   
        $(".dashboard-cafe-list").css("display", "none");
     });
     
     $(".cafe-list").click(function() {
        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");
        $(".dashboard-food-list").css("display", "none"); 
        $(".dashboard-restaurant-list").css("display", "none");   
        $(".dashboard-cafe-list").css("display", "block");
     });
     
     $(".restaurant-list").click(function() {
        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none"); 
        $(".dashboard-food-list").css("display", "none"); 
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "block");           
     });

    $(".hotel-list").click(function(){
	    $(".location-list").removeClass("active-links");
	    $(".food-list").removeClass("active-links");      
        $(".health-list").removeClass("active-links");
        $(".cab-list").removeClass("active-links");
        $(".guide-list").removeClass("active-links");
        $(".hotel-list").addClass("active-links");
	    
        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-food-list").css("display", "none"); 
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none"); 
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "block");
     });

    $(".health-list").click(function(){
	    $(".location-list").removeClass("active-links");
	    $(".food-list").removeClass("active-links"); 
        $(".hotel-list").removeClass("active-links");            
        $(".cab-list").removeClass("active-links");
        $(".guide-list").removeClass("active-links");       
        $(".health-list").addClass("active-links");
	
        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-food-list").css("display", "none"); 
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");        
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");
        $(".dashboard-health-list").css("display", "block");      
     });

     $(".cab-list").click(function(){
	    $(".location-list").removeClass("active-links");
	    $(".food-list").removeClass("active-links"); 
        $(".hotel-list").removeClass("active-links");
        $(".health-list").removeClass("active-links");            
        $(".guide-list").removeClass("active-links");       
        $(".cab-list").addClass("active-links");

        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-food-list").css("display", "none"); 
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");   
        $(".dashboard-health-list").css("display", "none");      
        $(".dashboard-guide-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "block");     
     });

     $(".guide-list").click(function(){
	    $(".location-list").removeClass("active-links");
	    $(".food-list").removeClass("active-links"); 
        $(".hotel-list").removeClass("active-links");
        $(".health-list").removeClass("active-links"); 
        $(".cab-list").removeClass("active-links");           
        $(".guide-list").addClass("active-links");       
        
        $(".welcome-page").css("display", "none");
        $(".dashboard-location-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-food-list").css("display", "none"); 
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");   
        $(".dashboard-health-list").css("display", "none");              
        $(".dashboard-cab-list").css("display", "none"); 
        $(".dashboard-guide-list").css("display", "block");    
     });

}); */