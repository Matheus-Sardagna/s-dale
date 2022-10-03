
console.log("teste");

type Rect = {
    width?: number,
    height?: number
};

type Triangle = {
    angle: number,
    type: "isosceles" | "scalenes" | "obtuse"
};

type Circle = {
    radius: number;
};

type GeometricFigure = Rect | Triangle | Circle;

let t: GeometricFigure = {
    angle: 45,
    type: "isosceles"
};

t = {
    radius: 9
};

let rect: Rect = {
    width: 20,
    height: 30
};

console.log(rect.height);

// let numeros: (string | number)[];
// numeros = [true, 0, ""];

let f = (x: number,y: number) : number  => {
    return x + y;
}

let numeros: number;
numeros = f(2.4, -6);