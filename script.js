// if (/Mobi|Android/i.test(navigator.userAgent)) {
//     alert("This website is best viewed in desktop mode. Please enable desktop site mode in your browser.");
//   }
  
let menuIcon = document.querySelector('#menu-icon');
let navbar = document.querySelector('.navbar');

menuIcon.onclick = () =>{
    menuIcon.classList.toggle('fa-x')
    navbar.classList.toggle('active');
}
