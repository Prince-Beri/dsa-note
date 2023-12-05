var rect = document.getElementById("center");
rect.addEventListener("mousemove", function(details){
    var mouseLocation = rect.getBoundingClientRect();
    var mouseLocationInsideRect = details.clientX - mouseLocation.left;
    if(mouseLocationInsideRect < rect.getBoundingClientRect().width / 2){
        let colorVal = gsap.utils.mapRange(0,mouseLocation.width / 2, 255, 0, mouseLocationInsideRect);
        gsap.to(rect, {
            backgroundColor: `rgb(${colorVal}, 0, 0)`,
            ease: Power4,

        });
    }else{
        let colorVal = gsap.utils.mapRange(mouseLocation.width / 2, mouseLocation.width, 0, 255, mouseLocationInsideRect);
        gsap.to(rect, {
            backgroundColor: `rgb(0, 0, ${colorVal})`,
            ease: Power4
        });
    }
});

rect.addEventListener("mouseleave", function(){
    gsap.to(rect, {
        backgroundColor: "rgb(255, 255, 255)",
        ease: Power4,
    })
});
