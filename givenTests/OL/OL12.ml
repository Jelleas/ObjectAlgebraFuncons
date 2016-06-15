let deriv f dx = function x -> (f(x +. dx) -. f(x)) /. dx;;
(* deriv : (float -> float) -> float -> float -> float = <fun> *)

let cos = deriv sin 0.0000000000001;;
(* cos : float -> float = <fun> *)

(* cos pi;; *)
cos 3.14159265359;;
(* - : float = -0.999200722163 *)
