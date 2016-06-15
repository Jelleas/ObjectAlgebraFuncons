let min a b = if a < b then a else b;;

let add_vect v1 v2 =
  let len = min (vect_length v1) (vect_length v2) in
  let res = make_vect len 0.0 in
  for i = 0 to len - 1 do
    res.(i) <- ((v1.(i)) +. (v2.(i)))
  done;
  res;;
(* add_vect : float vect -> float vect -> float vect = <fun> *)

add_vect [| 1.0, 2.0 |] [| 3.0, 4.0 |];;
(* - : float vect = [|4.0; 6.0|] *)

