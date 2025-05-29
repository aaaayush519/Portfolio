// if (/Mobi|Android/i.test(navigator.userAgent)) {
//     alert("This website is best viewed in desktop mode. Please enable desktop site mode in your browser.");
//   }
  
// JavaScript for handling the mobile navigation menu toggle
let menuIcon = document.querySelector('#menu-icon');
let navbar = document.querySelector('.navbar');

// When the menu icon is clicked:
menuIcon.onclick = () => {
    // Toggle the 'fa-x' class on the menu icon,
    // which changes the icon between a menu bars and an 'X'
    menuIcon.classList.toggle('fa-x');

    // Toggle the 'active' class on the navbar,
    // which controls its visibility (slide in/out effect via CSS)
    navbar.classList.toggle('active');
}