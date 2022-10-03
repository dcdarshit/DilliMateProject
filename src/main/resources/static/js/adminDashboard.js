$(document).ready(function() {

    $(".location-types").click(function() {
        $(".location-category").slideToggle();
        $(".food-category").css("display", "none");
    });
    
    $(".food-types").click(function() {
        $(".food-category").slideToggle();
        $(".location-category").css("display", "none");
    });
    
   /* $(".location-list").click(function(){
	    $(".food-list").removeClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");
	    $(".location-list").addClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
        
        $(".welcome-page").css("display", "block");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");    
        $(".dashboard-food-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");   
        $(".dashboard-cafe-list").css("display", "none");      
     });
     
     $(".museum-list").click(function() { 
        $(".location-list").addClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").addClass("sidebar-active-sub-links");    
        $(".food-list").removeClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");
	    
	    
	    $(".welcome-page").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");
        $(".dashboard-museum-list").css("display", "block");
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");    
        $(".dashboard-food-list").css("display", "none");       	    
     });
     
     $(".monument-list").click(function() { 
        $(".location-list").addClass("sidebar-active-links");
	    $(".monument-list").addClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");    
        $(".food-list").removeClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");
	   	    
	    $(".welcome-page").css("display", "none");
        $(".dashboard-monument-list").css("display", "block");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-cafe-list").css("display", "none"); 
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");                     
     });
     
     $(".food-list").click(function(){
        $(".location-list").removeClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
	    $(".food-list").addClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");
	            
        $(".welcome-page").css("display", "block");
        $(".dashboard-museum-list").css("display", "none");
        $(".dashboard-monument-list").css("display", "none");       
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");              
     });
     
     $(".cafe-list").click(function(){
        $(".location-list").removeClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
	    $(".food-list").addClass("sidebar-active-links");
	    $(".cafe-list").addClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");    
        
        $(".welcome-page").css("display", "none");
        $(".dashboard-museum-list").css("display", "none"); 
        $(".dashboard-monument-list").css("display", "none");             
        $(".dashboard-cafe-list").css("display", "block");
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");            
     });
     
     $(".restaurant-list").click(function(){
        $(".location-list").removeClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
	    $(".food-list").addClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").addClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");    
        
        $(".welcome-page").css("display", "none");
        $(".dashboard-museum-list").css("display", "none"); 
        $(".dashboard-monument-list").css("display", "none");             
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "block");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");            
     });
     
     $(".hotel-list").click(function(){
        $(".location-list").removeClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
	    $(".food-list").removeClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").addClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");    
        
        $(".location-category").css("display", "none");
        $(".food-category").css("display", "none");
        $(".welcome-page").css("display", "none");
        $(".dashboard-museum-list").css("display", "none"); 
        $(".dashboard-monument-list").css("display", "none");             
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "block");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");            
     });
     
     $(".health-list").click(function(){
        $(".location-list").removeClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
	    $(".food-list").removeClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").addClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");    
        
        $(".location-category").css("display", "none");
        $(".food-category").css("display", "none");
        $(".welcome-page").css("display", "none");
        $(".dashboard-museum-list").css("display", "none"); 
        $(".dashboard-monument-list").css("display", "none");             
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "block");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "none");            
     });
     
     $(".cab-list").click(function(){
        $(".location-list").removeClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
	    $(".food-list").removeClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").addClass("sidebar-active-links");
        $(".guide-list").removeClass("sidebar-active-links");    
        
        $(".location-category").css("display", "none");
        $(".food-category").css("display", "none");
        $(".welcome-page").css("display", "none");
        $(".dashboard-museum-list").css("display", "none"); 
        $(".dashboard-monument-list").css("display", "none");             
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "block");
        $(".dashboard-guide-list").css("display", "none");            
     });
     
     $(".guide-list").click(function(){
        $(".location-list").removeClass("sidebar-active-links");
	    $(".monument-list").removeClass("sidebar-active-sub-links");
	    $(".museum-list").removeClass("sidebar-active-sub-links");
	    $(".food-list").removeClass("sidebar-active-links");
	    $(".cafe-list").removeClass("sidebar-active-sub-links");
	    $(".restaurant-list").removeClass("sidebar-active-sub-links");
        $(".hotel-list").removeClass("sidebar-active-links");
        $(".health-list").removeClass("sidebar-active-links");
        $(".cab-list").removeClass("sidebar-active-links");
        $(".guide-list").addClass("sidebar-active-links");    
        
        $(".location-category").css("display", "none");
        $(".food-category").css("display", "none");
        $(".welcome-page").css("display", "none");
        $(".dashboard-museum-list").css("display", "none"); 
        $(".dashboard-monument-list").css("display", "none");             
        $(".dashboard-cafe-list").css("display", "none");
        $(".dashboard-restaurant-list").css("display", "none");  
        $(".dashboard-health-list").css("display", "none");
        $(".dashboard-hotel-list").css("display", "none");
        $(".dashboard-cab-list").css("display", "none");
        $(".dashboard-guide-list").css("display", "block");            
     });
     */
     
});