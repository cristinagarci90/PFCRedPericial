/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    
var contenedor = $('#div');
var tiempo = 15000;
contenedor.css({'background-image':'url(../img/1.jpg)'}); 
 
function image(){
setTimeout(function() {
contenedor.fadeTo('slow', 0.3, function() {
$(this).css({'background-image':'url(../img/2.jpg)'}); 
otra_imagen();}).fadeTo('slow', 1); },tiempo); }
 
function otra_imagen(){
setTimeout(function() {
contenedor.fadeTo('slow', 0.3, function() {
$(this).css({'background-image':'url(../img/3.jpg)'}); 
otra_img0();
}).fadeTo('slow', 1); },tiempo);
}
 
function otra_img0(){
setTimeout(function() {
contenedor.fadeTo('slow', 0.3, function() {
$(this).css({'background-image':'url(../img/4.jpg)'}); 
otra_img1();
}).fadeTo('slow', 1); },tiempo);
}
 
function otra_img1(){
setTimeout(function() {
contenedor.fadeTo('slow', 0.3, function() {
$(this).css({'background-image':'url(../img/5.jpg)'}); 
otra_img2();
}).fadeTo('slow', 1); },tiempo);
}
 
function otra_img2(){
setTimeout(function() {
contenedor.fadeTo('slow', 0.3, function() {
$(this).css({'background-image':'url(../img/6.jpg)'}); 
otra_img3();
}).fadeTo('slow', 1); },tiempo);
}
 
function otra_img3(){
setTimeout(function() {
contenedor.fadeTo('slow', 0.3, function() {
$(this).css({'background-image':'url(../img/1.jpg)'}); 
image();
}).fadeTo('slow', 1); },tiempo);
}
 
otra_imagen();
 
});
