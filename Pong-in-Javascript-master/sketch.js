// Informações da Bolinha
let xBolinha = 300;
let yBolinha = 200;
let diamentro = 15;
let raio = diamentro /  2;

// Velocidade da bolinha
let xvelocidade = 5;
let yvelocidade = 5;

// raquete
let xRaquete = 5
let yRaquete = 150;
let comprimento = 10;
let altura = 90;

// Oponente
let xOponente = 585;
let yOponente = 150;
let yVelocidadeOponente;

// Placar do Jogo
let pontos = 0;
let inimigoPontos = 0;

function setup() {
    createCanvas(600, 400);
}

function draw() {
    background(0);
    Bolinha();
    movimentacao();
    colisao();
    raquete(xRaquete, yRaquete);
    movimentacaoRaquete();
    verificaColisãoRaquete();  
    raquete(xOponente, yOponente);
    movimentacaoInimigo();
    incluirPlacar(); 
    marcaPonto();
}

function Bolinha(){
    circle(xBolinha, yBolinha, diamentro);
}

function movimentacao(){
    xBolinha += xvelocidade;
    yBolinha += yvelocidade;
}

function colisao(){
    if (xBolinha + raio > width || xBolinha - raio < 0){
        xvelocidade *= -1;
    }
    if (yBolinha + raio > height || yBolinha - raio < 0){
        yvelocidade *= -1;
    }
}

function raquete(x,y){
    rect(x, y, comprimento, altura)
}

function movimentacaoRaquete(){
    if(keyIsDown(UP_ARROW)){
        yRaquete -= 10;
    }

    if(keyIsDown(DOWN_ARROW)){
        yRaquete += 10;
    }
}

function verificaColisãoRaquete(){
    if(xBolinha - raio < xRaquete + comprimento && yBolinha - raio < yRaquete + altura && yBolinha + raio > yRaquete){
        xvelocidade *= -1;
    }
    if(xBolinha + raio > xOponente + comprimento && yBolinha + raio < yOponente + altura && yBolinha + raio > yOponente){
        xvelocidade *= -1;
    }
}

function movimentacaoInimigo(){
    yVelocidadeOponente = yBolinha - yOponente - comprimento / 2 - 30;
    yOponente += yVelocidadeOponente
}

function incluirPlacar(){
    textAlign(CENTER);
    textSize(16);
    fill(255)
    text(pontos, 150, 26);
    text(inimigoPontos, 450, 26);
}

function marcaPonto(){
    if(xBolinha > 590){
        pontos++;
    }
    if(xBolinha < 10){
        inimigoPontos++;
    }
}