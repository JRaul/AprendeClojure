(fn duplicar [x] (* 2 x)) ;;Se crea una funcion con nombre
(fn[x] (* 2 x))  ;; Una funcion anonima(Sin nombre)
#(* %)   ;;una forma mas corta de escribir una funcion anonima
(defn duplicar[x]      ;;una funcion con nombre y documentacion
  "Duplica un numero"
  (* 2 x))

(doc duplicar) ;; como acceder a la documentacion.
(defn pitagoras [a b]
  (+ (* a a) (* b b)))

(defn triangulo-rectangulo? [a b c]
  (= (pitagoras a b) c))
(if (= 2 2) "Estas bien" "Estas mal")

(defn es-par[n]
     (if (= (mod n 2) 0) "Es par" "No es par") )

(defn resultado[ a puntaje-a b puntaje-b]
  (if (> puntaje-a puntaje-b) (str "Gana" " "  a)
    (if (< puntaje-a puntaje b) (str "Gana" " " b)
      (str "Empate entre" " " a " " "y" " " b) )))

(defn resultado-cond[ a puntaje-a b puntaje-b]
  (cond (> puntaje-a puntaje-b) (str "Gana" " " a)
        (< puntaje-a puntaje b) (str "Gana" " " b)
        :else (str "Empate entre" " " a" " "y" " "b) ))