// Personaje de TV
let nombre = "Tanjiro";
let anime = "Kimetsu no Yaiba";
let edad = 16;

let personaje = {
    nombre: "Inosuke",
    anime: "Kimetsu no Yaiba",
    edad: 16,
};
console.log(personaje);
console.log(personaje.nombre);

personaje.edad = 21;

delete personaje.anime;

console.log(personaje)