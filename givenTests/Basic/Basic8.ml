let v0 = [| |] ;;
(* v0 : 'a vect = [||] *)

let v1 = [| 1 |] ;;
(* v1 : int vect = [|1|] *)

v1.(vect_length v0) ;;
(* - : int = 1 *)
